import java.util.ArrayList;

public class Problem17
{

    public static void main(String[] args)
    {
        ArrayList<Double> list1 = new ArrayList<Double>();
        list1.add(-1.6);
        list1.add(-0.9);
        list1.add(3.2);
        list1.add(4.5);

        ArrayList<Double> list2 = new ArrayList<Double>();        
        list2.add(-4.5);
        list2.add(3.2);
        list2.add(20.4);

        ArrayList<Double> mergedList = merge(list1, list2);

        System.out.println("Output should be:");
        System.out.println("List1:  [-1.6, -0.9, 3.2, 4.5]");
        System.out.println("List2:  [-4.5, 3.2, 20.4]");
        System.out.println("Merge:  [-4.5, -1.6, -0.9, 3.2, 3.2, 4.5, 20.4]");
        System.out.println("\nList1:  " + list1);
        System.out.println("List2:  " + list2);
        System.out.println("Merge:  " + mergedList);

        list1.clear();
        mergedList = merge(list1, list2);
        System.out.println("\nOutput should be:");
        System.out.println("List1:  []");
        System.out.println("List2:  [-4.5, 3.2, 20.4]");
        System.out.println("Merge:  [-4.5, 3.2, 20.4]");
        System.out.println("\nList1:  " + list1);
        System.out.println("List2:  " + list2);
        System.out.println("Merge:  " + mergedList);  

        list1 = null;
        mergedList = merge(list1, list2);
        System.out.println("\nOutput should be:");
        System.out.println("List1:  null");
        System.out.println("List2:  [-4.5, 3.2, 20.4]");
        System.out.println("Merge:  [-4.5, 3.2, 20.4]");
        System.out.println("\nList1:  " + list1);
        System.out.println("List2:  " + list2);
        System.out.println("Merge:  " + mergedList); 

        list2 = null;
        mergedList = merge(list1, list2);
        System.out.println("\nOutput should be:");
        System.out.println("List1:  null");
        System.out.println("List2:  null");
        System.out.println("Merge:  null");
        System.out.println("\nList1:  " + list1);
        System.out.println("List2:  " + list2);
        System.out.println("Merge:  " + mergedList); 
    }

    /**
     * The merge method will take two ArrayList<Double> parameters, both sorted from low to high,
     * and return an ArrayList<Double> which merges the two parameters, keeping the data sorted.
     * 
     * @param  nums1  An ArrayList<Double> of values, sorted from low to high.
     * @param  nums2  An ArrayList<Double> of values, sorted from low to high.
     * 
     * @return  null, if both nums1 and nums2 are null;
     *          otherwise return an ArrayList<Double> with the merged information, sorted low to high
     *          
     * Precondition:  nums1 and nums2, if non-null, are sorted from low to high
     * 
     * Postcondition:  nums1 and nums2 are unchanged.
     */
    private static ArrayList<Double> merge(ArrayList<Double> nums1, ArrayList<Double> nums2){
        ArrayList<Double> output = new ArrayList<Double>();
        if(nums1 == null && nums2 == null)
            return null;
        else if (nums1 == null) 
        { 
            return nums2; 
        } 
        else if (nums2 == null) 
        { 
            return nums1; 
        } 
        else 
        {
            ArrayList<Double> copyList1 = new ArrayList<Double>();
            ArrayList<Double> copyList2 = new ArrayList<Double>();
            
            for(Double num: nums1){
                copyList1.add(num);
            }
            for(Double num: nums2){
                copyList2.add(num);
            }
            
            while(copyList1.size() > 0 && copyList2.size() > 0){
                if(copyList1.get(0) < copyList2.get(0))
                output.add(copyList1.remove(0));
                else
                output.add(copyList2.remove(0));
            }
            while (copyList1.size() > 0) 
            output.add(copyList1.remove(0)); 
             
            while (copyList2.size() > 0) 
                output.add(copyList2.remove(0)); 

        }

            return output;
        }
    }
