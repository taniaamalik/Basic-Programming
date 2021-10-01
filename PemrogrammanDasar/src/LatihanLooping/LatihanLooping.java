package LatihanLooping;

public class LatihanLooping {

    public static void main(String[] args) {
        /*int a;
        int b =3;
        
        for (a=10;1>=b;a-=b
        }
        System.out.println(a);
    }
}*/

 /*int a = 9;
        int b =3;

         while (a>=b){
            a-=b;
        }
        System.out.println(a);
    }
}*/
 /*int a = 9;
        int b = 3;
        int c = 0;
        
        while(c<a){
            c=c+b;
        }
        System.out.println(a-c);
            
        }
}*/

 /*int a = 9;
        int b = 3;
        int c = 0;
        
        while(c<a){
            c=c+b;
        
        if(c>a){
        c-=b;
        break;
}
        System.out.println(a-c);
            
        }
    }
}*/
 /*int a = 9;
        int b = 3;
        int c = 0;
        
        while(c+b<=a){
            c=c+b;
        }
        System.out.println(a-c);
            
        }
}*/
 /*int a = 9;
        int b = 3;
        int c = 0;
        
        while(c+b<=a){
            c+=b;
        }
        System.out.println(a-c);
            
        }
}*/
        //saat ini tahun 2017,nilai tukar dolar tahun depan 13700
        /*int now = 2017;
int target = 2020;
int usdNow = 13500;
int usdNextYear = 13700;
int diff = usdNextYear - usdNow;

while (now<target){
    usdNow+=diff;
    
    now++;
}
        System.out.println(usdNow);
    }
}*/

 /*for (int i = 0; i < 10; i++) {
            if (i%4==0){
                continue; //dia continue kalo 0 dan 4 dan 8 yg habis dibagi 4 
            }
            System.out.println(i);
        }
    }
}*/
        for (int i = 0; i < 10; i++) {
            if (i % 4 == 0) {
                continue; //dia continue kalo 0 dan 4 dan 8 yg habis dibagi 4 , mencontinue yg kondisi if
            }
            if (i > 5) {
                break; //mengakhiri looping secara keseluruhan
            }
            System.out.println(i);
        }
    }
}