import java.util.Arrays;

/**
 * Author : Zhang Zhe
 */
 class MyLink {
     private int[] elem;
     private final int CAPAAITR=5;
     private int usedsize;

     public MyLink(){                               //构造方法，初始化数据
         this.elem=new int[CAPAAITR];
         this.usedsize=0;
     }

     public void display(){
         for(int i=0;i<usedsize;i++){
             System.out.print(elem[i]+"  ");
         }
         System.out.println();
     }
     private boolean isflull(){                 //判断有效数据个数与数组长度的关系
         if(usedsize==elem.length){
             return true;
         }else{
             return false;
         }
     }
     public void add(int pos,int data){         //在某个位置插入
         if(isflull()){
             this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
         }
         if(pos<0||pos>this.elem.length){
             System.out.println("该位置不合法！");
         }
         for(int i=this.usedsize-1;i>=pos;i--){         //挪数据
             this.elem[i+1]=this.elem[i];
         }
         this.elem[pos]=data;
         this.usedsize++;
     }
     public boolean contains(int toFind) {
         for (int i = 0; i < this.usedsize; i++) {
             if (this.elem[i] == toFind) {
                 return true;
             }
         }
         return false;
     }

    public int search(int toFind){
            for(int i=0;i<this.usedsize;i++){
                if(toFind==this.elem[i]){
                    return i;
                }
            }
            return -1;
    }
    public boolean remove(int key){
         if(contains(key)){
                for(int i=search(key);i<this.usedsize-1;i++){
                    this.elem[i]=this.elem[i+1];
                    }
                 usedsize--;
                return true;
         }
         return false;
    }

}
