import math


# 基数排序

def radix_sort(the_list, radix=10):
    # print math.log(max(the_list), radix)
    # print max(the_list)
    i = int(math.ceil(math.log(max(the_list), radix)))
    print(i)
    # log(radix)max(the_list)，radix为底，max(the_list)的对数，其中radix为底数，max(the_list)为真数，这样就巧妙的获取了数字的位数
    bucket = [[] for i in range(radix)]
    # print bucket
    for i in range(1, i + 1):  # i次循环
        # print(the_list)
        for val in the_list:
            # print val
            # print radix
            # print val % (radix ** i)
            # print(radix ** (i - 1))
            print("+++++++++++++++" + str(val % (radix ** i) / (radix ** (i - 1))))
            bucket[int(val % (radix ** i) / (radix ** (i - 1)))].append(val)  # 析取整数第K位数字 （从低到高）
        print(bucket)
        # print the_list[:]
        del the_list[:]  # 把列表清空但列表还在，效果同the_list=[]一样

        for each in bucket:
            the_list.extend(each)  # 桶合并
        # the_list=bucket
        print("======================")
        # print the_list
        bucket = [[] for i in range(radix)]

    return the_list


if __name__ == '__main__':
    the_list = [10, 1, 18, 30, 23, 12, 7, 5, 18, 17]
    print("排序前：" + str(the_list))
    print("排序后：" + str(radix_sort(the_list)))