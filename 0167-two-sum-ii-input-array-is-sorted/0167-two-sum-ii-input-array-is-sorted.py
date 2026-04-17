class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        right = 0
        left = len(numbers)-1
        while right < left:
            sum = numbers[right]+numbers[left]
            if sum > target:
                left-=1
            elif sum < target:
                right+=1
            else:
                return [right+1,left+1]
        return -1


        