public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];
        System.out.println("До сортировки");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1001));
              }

        System.out.println("После сортировки");
        for (int i = 1; i < array.length; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                if (array[j] > array[j - 1]) break;
                int xx      = array[j];
                array[j]    = array[j - 1];
                array[j - 1]  = xx;

            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}