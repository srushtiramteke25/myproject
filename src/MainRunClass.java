import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainRunClass {
    public static void main(String args[]) {
//        boolean answer = isPalindrome(010);
//        List a = Arrays.asList(1, 2, 3);
//        List b = Arrays.asList(1, 4, 6);
//        //concatenate(a,b);
//        int[] nums = {1, 4, 2, 3, 3, 1};
//        System.out.println("The merged " + concatenate(a, b));

        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                //run code that you need to execute by a thread
                System.out.println("We are in the new thread---"+Thread.currentThread().getName());
            }
        });
        thread.setName("New Worker Thread");
        System.out.println("The Thread before running is---"+Thread.currentThread().getName());
        thread.start();
        System.out.println("The Thread after running is---"+Thread.currentThread().getName());

    }


    static boolean isPalindrome(int x) {
        int rem, sum = 0, temp;
        temp = x;
        while (x > 0) {
            rem = x % 10;
            sum = (sum * 10) + rem;
            x = x / 10;
        }
        System.out.println("The temp in the end is " + temp);
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }


    public static List concatenate(List a, List b) {
        // Function to merge two arrays of
        // same type
        return Stream.of(a, b).flatMap(Stream::of)
                .toList();

        // Arrays::stream can also be used in place
        // of Stream::of in the flatMap() above.
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
