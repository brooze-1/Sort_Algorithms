from numpy.random import randint


def ConutingSort(A):
    k = max(A)  # A的最大值，用于确定C的长度
    C = [0] * (k + 1)  # 通过下表索引，临时存放A的数据
    B = (len(A)) * [0]  # 存放A排序完成后的数组
    for i in range(0, len(A)):
        C[A[i]] += 1  # 记录A有哪些数字，值为A[i]的共有几个
    for i in range(1, k + 1):
        C[i] += C[i - 1]  # A中小于i的数字个数为C[i]
    for i in range(len(A) - 1, -1, -1):
        B[C[A[i]] - 1] = A[i]  # C[A[i]]的值即为A[i]的值在A中的次序
        C[A[i]] -= 1  # 每插入一个A[i]，则C[A[i]]减一
    return B


A = list(randint(1, 99, 10))
print(A)
A = ConutingSort(A)
print(A)