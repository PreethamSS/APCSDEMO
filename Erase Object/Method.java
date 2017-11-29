public class Method
{  
    public static String[][] erase(int x, int y, String[][] array){
        String [][] arr = new String[20][20];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                arr[row][col] = array[row][col];
        }
    }
        
    if (arr[x][y].equals("@")){
        arr[x][y] = "-";
        if (x < 19)
        arr = erase(x + 1, y, arr);
        if (x > 0)
        arr = erase(x - 1, y, arr);
        if (y < 19)
        arr = erase(x, y + 1, arr); 
        if (y > 0)
        arr = erase(x, y - 1, arr);
        return arr;
    }
    else 
    return arr;
    }
}
