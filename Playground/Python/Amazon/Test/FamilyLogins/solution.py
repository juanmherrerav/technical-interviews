#!/bin/python3 ...
#
# Complete the'count Family Logins'function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING_ARRAY logins as parameter.
#
import os


def countFamilyLogins(logins):
   # generate all rotated combinations
    rotated = []
    for login in logins:
       rotated.append(rotated_word(login))
    # count how many items of rotated are in logins
    count = 0
    for rotated_login in rotated:
        count = count+logins.count(rotated_login)
    return count
    # Write your code here


def rotated_word(word):
    rotated = ''
    for letter in word:
        rotated = rotated+next_alpha_lower(letter)
    return rotated


def next_alpha_lower(s: str) -> str:
    return chr((ord(s.lower())+1-97) % 26+97)


if __name__ == "__main__":
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    logins_count = int(input().strip())
    logins = []
    for _ in range(logins_count):
        logins_item = input()
        logins.append(logins_item)
    result = countFamilyLogins(logins)
    fptr.write(str(result)+'\n')
    fptr.close()