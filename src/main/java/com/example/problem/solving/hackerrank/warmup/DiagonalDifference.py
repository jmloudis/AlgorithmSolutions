class DiagonalDifference:
    def diagonalDifference(arr):
    # Write your code here
        major = 0;
        minor = 0;
        result = 0;
        for i in range(len(arr)):
            major += arr[i][i]
            minor += arr[i][len(arr) - i - 1]
        result = abs(major - minor)
        print(result)
        return result