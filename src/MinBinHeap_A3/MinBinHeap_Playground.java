package MinBinHeap_A3;

public class MinBinHeap_Playground {
	public static void main(String[] args){   
		//Add more tests as methods and call them here!!
//		TestBuild();
//		TestBuild2();
		TestBuild3();
		TestBuild4();
	}

	public static void TestBuild(){ 
		// constructs a new minbinheap, constructs an array of EntryPair, 
		// passes it into build function. Then print collection and heap.
		MinBinHeap mbh= new MinBinHeap();
		EntryPair[] collection= new EntryPair[8];
		collection[0]=new EntryPair("a",3);
		collection[1]=new EntryPair("b",5);
		collection[2]=new EntryPair("c",1);
		collection[3]=new EntryPair("d",0);
		collection[4]=new EntryPair("e",46);
		collection[5]=new EntryPair("f",5);
		collection[6]=new EntryPair("g",6);
		collection[7]=new EntryPair("h",17);
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());

		System.out.println("min " + mbh.getMin().value);
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());

		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("min " + mbh.getMin().value);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());

		System.out.println("");
		System.out.println("");
		System.out.println("");
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());

		mbh.insert(new EntryPair("a", 1));
		mbh.insert(new EntryPair("b", 2));
		mbh.insert(new EntryPair("c", 3));

		System.out.println("min " + mbh.getMin().value);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
		mbh.delMin();
		mbh.delMin();
		System.out.println("min " + mbh.getMin().value);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
	}

	public static void TestBuild2() {
		MinBinHeap mbh= new MinBinHeap();
		mbh.insert(new EntryPair("c", 3));
		mbh.insert(new EntryPair("b", 2));
		mbh.insert(new EntryPair("a", 1));
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
		System.out.println("min " + mbh.getMin().value);
		System.out.println("");
		System.out.println("");
		
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
		System.out.println("min " + mbh.getMin().value);
		System.out.println("");
		System.out.println("");
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
		System.out.println("min " + mbh.getMin().value);
	}

	public static void TestBuild3() {
		// {<"a", 5>, <"b", 4>, <"c", 3>, <"d", 2>, <"e", 1>}
		MinBinHeap mbh= new MinBinHeap();
		EntryPair[] collection= new EntryPair[5];
		collection[0]=new EntryPair("a",5);
		collection[1]=new EntryPair("b",4);
		collection[2]=new EntryPair("c",3);
		collection[3]=new EntryPair("d",2);
		collection[4]=new EntryPair("e",1);
		
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("");
		System.out.println(mbh.size());
		System.out.println("min " + mbh.getMin().value);
	}
	
	public static void TestBuild4() {
		// {<"a", 5>, <"b", 4>, <"c", 3>, <"d", 2>, <"e", 1>}
		MinBinHeap mbh= new MinBinHeap();
		EntryPair[] collection= new EntryPair[5];
		collection[0]=new EntryPair("a",5);
		collection[1]=new EntryPair("b",4);
		collection[2]=new EntryPair("c",3);
		collection[3]=new EntryPair("d",2);
		collection[4]=new EntryPair("e",-1);
		
		mbh.build(collection);
	}

	public static void printHeapCollection(EntryPair[] e) { 
		//this will print the entirety of an array of entry pairs you will pass 
		//to your build function.
		System.out.println("Printing Collection to pass in to build function:");
		for(int i=0;i < e.length;i++){
			System.out.print("("+e[i].value+","+e[i].priority+")\t");
		}
		System.out.print("\n");
	}

	public static void printHeap(EntryPair[] e,int len) { 
		//pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th index....
		System.out.println("Printing Heap");
		for(int i=1;i < len+1;i++){
			System.out.print("("+e[i].value+","+e[i].priority+")\t");
		}
		System.out.print("\n");
	}
}