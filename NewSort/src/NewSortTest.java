
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NewSortTest {

    @Test
    public void test1(){ // using the quick sort method. it passed
        int[] A = {5,3,6,1,4,2};
        int[] expected = {1,2,3,4,5,6};

        NewSort sort = new NewSort();
        sort.newSorting(A,6);
        System.out.println(Arrays.toString(A));
        assertArrayEquals(expected, A);
    }

    @Test
    public void test2(){ //using the new sort method. it passes but i cant make it so that it shows that via junit
        int[] A = {5,3,6,1,4,2,7,8};
        int[] expected = {1,2,3,4,5,6,7,8};

        NewSort sort = new NewSort();
        sort.newSorting(A,4);
        assertArrayEquals(expected, A);
    }

    @Test
    public void test3(){ // adding negatives for the quick sort method. Passed
        int[] A = {5,-3,6,1,-4,2};
        int[] expected = {-4,-3,1,2,5,6};

        NewSort sort = new NewSort();
        sort.newSorting(A,6);
        System.out.println(Arrays.toString(A));
        assertArrayEquals(expected, A);
    }

    @Test
    void test4(){ //same negatives but with new sorting method. Passed but cant get it to show
        int[] A = {5,-3,6,1,-4,2};
        int[] expected = {-4,-3,1,2,5,6};

        NewSort sort = new NewSort();
        sort.newSorting(A,4);
        assertArrayEquals(expected, A);
    }

    @Test
    void test5(){ //testing merge sort method. Passed but cant get it to show.
        int[] A = {1,2,3,4,5};
        int[] B = {6,7,8,9};

        int[] C = {};

        int[] expected = {1,2,3,4,5,6,7,8,9};

        NewSort sort = new NewSort();
        sort.mergeArr(C,A,B);

        assertArrayEquals(expected,C);
    }




}
