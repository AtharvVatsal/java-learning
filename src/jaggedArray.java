
public class jaggedArray {

    public static void main(String[] args) {
        //Jagged array is an array of arrays of which the member arrays can be of different lengths, producing rows of jagged edges when visualized as output.

        int num[][] = new int[3][];

        //Array created with rows 3 but variable collumns
        num[0] = new int[3]; //1st row will have 3 collums
        num[1] = new int[5]; //2nd row has 5 collumns
        num[2] = new int[1]; //3rd row has 1 collum
/*     
        ---
        -----
        -
 
*/

//Use .length to find the number of elements in each array
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
//        int threeDim [][][] = new int[2][1][4] //3d array
        //To get a value at row 1 , collum 3 and internal 4 use threeDim[1][3][4]
        //Use for loop for every new added dimension
    }
}
