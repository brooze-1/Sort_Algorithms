import random


def fun1(list1, low, high):
    # 以列表中的第一个数据为关键字
    key = list1[low]
    while low < high:
        while low < high and list1[high] >= key:
            high -= 1
        list1[low] = list1[high]
        while low < high and list1[low] <= key:
            low += 1
        list1[high] = list1[low]
    list1[low] = key
    return low


# 递归实现
def fun(list1, low, high):
    if low < high:
        # 获取中轴位置
        mid = fun1(list1, low, high)
        # 分为左右两个子表
        # 左表
        fun(list1, low, mid - 1)
        # 右表
        fun(list1, mid + 1, high)


def main():
    # 定义一个列表,存放十个数据,排序使用
    list1 = []
    for i in range(10):
        number = random.randint(1, 10)
        list1.append(number)
    fun(list1, 0, 9)
    print(list1)


if __name__ == '__main__':
    main()
