class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for par in s:
            if par=='(' or par=='{' or par=='[':
                stack.append(par)
            else:
                if not stack:
                    return False
                else:
                    top=stack[-1]
                    if par==')' and top=='(' or par=='}' and top=='{' or par==']' and top=='[':
                        stack.pop()
                    else:
                        return False
        if not stack:
            return True
        else:
            return False