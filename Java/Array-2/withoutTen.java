public int[] withoutTen(int[] arr) {
  int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j]==10)
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
                for(int i=0;i<arr.length;i++)
                if(arr[i]==10)
                arr[i]=0;
                return arr;
}
