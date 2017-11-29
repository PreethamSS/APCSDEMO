public class ERASE
{       
    public ERASE()
    {
     String[][] eraseArray = new String[20][20];
        for (int row = 0; row < eraseArray.length; row++) {
            for (int col = 0; col < eraseArray[0].length; col++) {
            eraseArray[row][col] = "-";
        }
    }
    
        int spaceIndex  = 0;
        String x_co = "";
        String y_co = "";
        String board    = Digital.readString();
        board = Digital.readString();
        while (board != null)
        {
            spaceIndex = board.indexOf(" ");
            x_co = board.substring(0, spaceIndex);
            y_co = board.substring(spaceIndex+1);

            int x = Integer.parseInt(x_co);
            int y = Integer.parseInt(y_co);
            
            eraseArray[x-1][y-1] = "@";
            board = Digital.readString();
        }
        

    for (int row = 0; row < eraseArray.length; row++) {
            for (int col = 0; col < eraseArray[0].length; col++) {
            System.out.print(eraseArray[row][col]);
        }
        System.out.println(" ");
    }
    
    System.out.println(" ");
    
    String[][] arrayErased = new String[20][20];
    arrayErased = Method.erase(16,14,eraseArray);
    
    for (int row = 0; row < arrayErased.length; row++) {
            for (int col = 0; col < arrayErased[0].length; col++) {
            System.out.print(arrayErased[row][col]);
        }
        System.out.println(" ");
    }
    
    System.out.println(" ");
    
    String[][] arrayErased2 = new String[20][20];
    arrayErased2 = Method.erase(2,1,arrayErased);
    
    for (int row = 0; row < arrayErased2.length; row++) {
            for (int col = 0; col < arrayErased2[0].length; col++) {
            System.out.print(arrayErased2[row][col]);
        }
        System.out.println(" ");
    }
    }
}
