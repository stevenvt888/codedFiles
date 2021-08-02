def maxDiff(arr):
	sArr=[]
	for i in range(len(arr)-1):
		sArr.append(arr[i] + arr[i+1])
	sArr.sort()
	return sArr[-1]