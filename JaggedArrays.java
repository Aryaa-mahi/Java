public class JaggedArrays {
    public static void main(String[] args) {
       //declaration
        int arr[][]= new int[7][];
        for(int i=0; i<arr.length;i++)
        arr[i] = new int[i+1];
         //initialization
        int count =0; 
        for(int i = 0;i < arr.length;i++)
        for (int j =0;j < arr[i].length;j++)
        arr[i][j] = count++;
        //displaying numbers
        System.out.println("Jagged Arrays: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            System.out.print((arr[i][j] + "*"));
            System.out.println('\n');
    }
   
}
}