public class Demo2 {
    public static void main(String a[]) {

        // Declaring multi-dimensional array
        int nums[][] = new int[3][4];

        // Assigning values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
