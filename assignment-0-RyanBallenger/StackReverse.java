

import java.util.*;


public class StackReverse {

	void reverse(Integer[] ints) throws Exception{

		// get number of ArrayStacks needed
		int length = ints.length;

		int size = length / 50;

		if(length % 50 != 0){
			size += 1;
		}

		ArrayStack[] holder = new ArrayStack[size];
		int count = 0;
		int asIndex = -1;

		// read all values into ArrayStack instances
		while(count < length){

			if(count % 50 == 0){
				ArrayStack current = new ArrayStack();
				holder[count/50] = current;

				asIndex = count/50;
			}

			holder[asIndex].push(ints[count]);
			count++;
		}


		count = 0;
		int index = size;

		// output ArrayStack pop's back into integer array
		while(index > 0){

			ArrayStack a = holder[index - 1];

			while(!a.isEmpty()){
				int value = (Integer)a.pop();

				ints[count] = value;
				count++;
			}

			index--;
		}
	
	}

	public static void main(String[] args){

		StackReverse sr = new StackReverse();

		Integer[] ints = new Integer[10000];

		for(int x=0; x<ints.length; x++){
			ints[x] = x;
		}

		try{
			sr.reverse(ints);
		} catch(Exception e){

		}

		for(int x:ints){
			System.out.println(x);
		}
	}



} 








