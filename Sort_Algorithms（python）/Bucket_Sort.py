import random
# 计时器：
import time


def cal_time(func):
    def wapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()
        print("%s running time is %s s:" % (func.__name__, end_time - start_time))
        return result

    return wapper


@cal_time
def count_sort(li, max_num):
    count = [0 for i in range(max_num + 1)]
    for num in li:
        count[num] += 1
    i = 0
    for num, m in enumerate(count):
        for j in range(m):
            li[i] = num
            i += 1


# 创建一个随机数列
data = []
for i in range(1000):
    data.append(random.randint(0, 100))
print(data)

count_sort(data, 100)
print(data)