package Method2;

public class MethodArray {
        public static void main(String[] args) {
            int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
            System.out.println("terbesar ke terkecil");
            arr = sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index ke " + (i + 1) + " : " + arr[i]);
            }
            System.out.println("==============================");
            System.out.println("terkecil ke terbesar");
            arr = sort2(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index ke " + (i + 1) + " : " + arr[i]);
            }
        }

        private static int[] sort(int[] acak) {
            int bil1 = 0;
            int bil2 = 0;
            while (bil1 < acak.length) {
                bil2 = bil1;
                while (bil2 < acak.length) {
                    if (acak[bil1] < acak[bil2]) {
                        int temp = acak[bil1];
                        acak[bil1] = acak[bil2];
                        acak[bil2] = temp;
                    }
                    bil2++;
                }
                bil1++;
            }
                return acak;
        }
    private static int[] sort2(int[] acak2) {
            int bil1 = 0;
            int bil2 = 0;
            while (bil1 < acak2.length) {
                bil2 = bil1;
                while (bil2 < acak2.length) {
                    if (acak2[bil1] > acak2[bil2]) {
                        int temp = acak2[bil1];
                        acak2[bil1] = acak2[bil2];
                        acak2[bil2] = temp;
                    }
                    bil2++;
                }
                bil1++;
            }
                return acak2;
        }
    }