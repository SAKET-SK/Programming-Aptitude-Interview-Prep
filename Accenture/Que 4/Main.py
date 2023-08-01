#as same question but in py
def findCount(arr, length, num, diff):
    count = 0 #a var for counting 
    
    for i in range(length):
        absolute_diff = abs(arr[i] - num)  #abs gives no -ve or complex values
        if absolute_diff <= diff:
            count += 1
    
    return count if count > 0 else -1 #if condition fail means

# Test example
arr = [12, 3, 14, 56, 77, 13]
num = 13
diff = 2
result = findCount(arr, len(arr), num, diff)
print("Output:", result)
