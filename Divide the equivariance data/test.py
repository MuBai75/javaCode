
def numberOfArithmeticSlices(A):
    count = 0
    k = 0
    for i in range(len(A) - 2):
        if A[i + 1] - A[i] == A[i + 2] - A[i + 1]:
            k += 1
            print(k)
            count += k
        else:
            k = 0
    return count
print(numberOfArithmeticSlices([1,2,3,8,9,10]))
