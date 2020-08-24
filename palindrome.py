''' Check if a string is a palindrome '''

def isPalindrome(string):
     return string == string[::-1]

'''test function '''

def main():
    print(isPalindrome("radar"))
    print(isPalindrome("cookie"))
    print(isPalindrome(""))
