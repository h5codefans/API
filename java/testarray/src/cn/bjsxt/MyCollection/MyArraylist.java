package cn.bjsxt.MyCollection;

/**
 * 模拟实现JDK中的ArrayList类
 * @author Administrator
 *
 */
public class MyArraylist {
    private Object[] value;
    private int size;
    
    public MyArraylist(){
    	//value=new Object[16];
    	this(10);
    }
    public MyArraylist(int size){
    	if(size<0){
        	   try{
             		throw new Exception();   //手动抛出一个异常
          	   }catch(Exception e){
          		   e.printStackTrace();
          	   }
       	}
    	value=new Object[size];
    }
    
    public int size(){
    	return size;
    }
    public boolean isEmpty(){
    	return size==0;
    }
    public void add(Object obj){
    	value[size]=obj;
    	size++;
    	if(size>=value.length){
    		//装不下了，扩容
    		int newCapacity=value.length*2;
    		Object[] newList=new Object[newCapacity];

            for(int i=0;i<value.length;i++){
            	newList[i]=value[i];
            }
    		value=newList;
    	}
    }
    public Object get(int index){
        rangeCheck(index);
    	return value[index];
    }
    
    public int indexOf(Object obj){
    	if(obj==null){
    		return -1;
    	}else{
    		for(int i=0;i<value.length;i++){
    			if(obj==value[i]){
    				return i;
    			}
    		}
    		return -1;
    	}
    }
    
    public int lastIndexOf(Object obj){
    	if(obj==null){
    		return -1;
    	}else{
    		for(int i=value.length-1;i>=0;i--){
    			if(obj==value[i]){
    				return i;
    			}
    		}
    		return -1;
    	}
    }
    
    public Object set(int index,Object obj){
    	rangeCheck(index);
    	Object old=value[index];
    	value[index]=obj;
    	return old;
    }
    
    public void rangeCheck(int index){
    	if(index<0||index>size-1){
       	   try{
            		throw new Exception();   //手动抛出一个异常
         	   }catch(Exception e){
         		   e.printStackTrace();
         	   }
      	}
    }
    public static void main(String[] args){
    	MyArraylist list=new MyArraylist(2);
    	list.add("aaa");
    	list.add(new Human("高琪"));
    	list.add("bbbb");
    	list.add("bbbb");
    	list.add("bbbb");
    	list.add("bbbb");
    	
    	System.out.println(list.isEmpty());
    	
    	System.out.println(list.indexOf("aaa"));
    	System.out.println(list.lastIndexOf("bbbb"));
    	System.out.println(list.get(3));
    	
    	Human h=(Human) list.get(1);
    	System.out.println(h.getName());
    	
    	list.set(2,"java");
    	System.out.println(list.get(2));
    	System.out.println(list.get(3));
        System.out.println(list.size());
    }
}
