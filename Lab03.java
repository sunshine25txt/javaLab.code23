void main() {
    // String num = IO.readln();
    // int n = Integer.parseInt(num);
    // if(n>0) {IO.println(n+" is Positive");}
    // else {IO.println(n+" is Negative");}
    // for(int i=0;i<n;i++) {
    //     for(int j=0;j<n;j++)IO.print(n);
    //     IO.println();
    // }
    // for(int i=0;i<n;i++) {
    //     if(i==0 || i==(n-1))
    //         IO.println(num.repeat(n));
    //     else
    //         IO.println(num+" ".repeat(n-2)+num);
    // }
    String line = IO.readln();
    String[] nums = line.split(" ");
    // IO.print(Integer.parseInt(nums[0])+
    //     Integer.parseInt(nums[1]));
    // IO.println(Arrays.stream(nums).
    //     mapToInt(Integer::parseInt).sum());
    // IO.print(Arrays.stream(nums).
    //     mapToInt(Integer::parseInt).average().getAsDouble());
    int sum =0;
    for(String s:nums)
        sum += Integer.parseInt(s);
    IO.print(sum);
}