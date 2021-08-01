 def numOfSwap(arr):
	pairSwap = 0
	n = 0
	temp = 0
	while n < (len(arr)-1):
		if (arr[n] > arr[n+1]):
			temp = arr[n]
			arr[n] = arr[n+1]
			arr[n+1] = temp
		pairSwap = pairSwap + 1
		n = n + 1

	for i in range(len(arr)):
		print(arr[i])

	print (pairSwap)