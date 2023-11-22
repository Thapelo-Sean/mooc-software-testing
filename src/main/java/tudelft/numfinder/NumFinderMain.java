package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        nf.find(new int[] {0, 25, 7, }); //omitted 3rd index
        nf.find(new int[] {4, 3, 2, -1});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
