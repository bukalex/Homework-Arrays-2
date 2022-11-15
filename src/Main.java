public class Main {
    public static void main(String[] args) {
        int[] nums = new int[30];
        nums = randArray(nums);

        System.out.println("Задание 1:");
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        System.out.println(sum);

        System.out.println(" ");

        System.out.println("Задание 2:");
        int min = 1000000;
        int max = 0;
        for(int i : nums){
            if(i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);

        System.out.println(" ");

        System.out.println("Задание 3:");
        float aver = ((float)sum)/nums.length;
        System.out.println(aver);

        System.out.println(" ");

        System.out.println("Задание 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] randArray(int[] array){
        java.util.Random random = new java.util.Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100000) + 100000;
        }

        return array;
    }
}