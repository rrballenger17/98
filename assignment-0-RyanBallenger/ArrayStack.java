



public class ArrayStack {

	private int MAXSIZE = 50;

	private Object[] data = null;

	private int size = -1;

	void push(Object obj) throws Exception{
		
		if(size >= MAXSIZE){
			throw new Exception("ArrayStack size is 50.");
		}

		size++;

		data[size - 1] = obj;
	}


	Object pop(){


		size--;

		return data[size];

	}


	boolean isEmpty(){
		return size == 0;
	}


	int getMaxSize(){
		return MAXSIZE;

	}


	public ArrayStack(){

		data = new Object[MAXSIZE];
		size = 0;

	}



} 





