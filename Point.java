ΚώΊΎ   =   point/Point  java/lang/Object x D y <init> ()V Code
    	 LineNumberTable LocalVariableTable this Lpoint/Point; setX (D)V	     getX ()D setY	     getY nhap_vao_3_diem *(Lpoint/Point;Lpoint/Point;Lpoint/Point;)V  java/util/Scanner	   " ! java/lang/System # $ in Ljava/io/InputStream;
  &  ' (Ljava/io/InputStream;)V	   ) * + out Ljava/io/PrintStream; - Nhap vao toa do x thu 1:
 / 1 0 java/io/PrintStream 2 3 print (Ljava/lang/String;)V
  5 6  
nextDouble
  8   : Nhap vao toa do y thu 1:
  <   > Nhap vao toa do x thu 2: @ Nhap vao toa do y thu 2: B Nhap vao toa do x thu 3: D Nhap vao toa do y thu 3: thu1 thu2 thu3 sc Ljava/util/Scanner; dodai_canh1_canh2 (Lpoint/Point;Lpoint/Point;)D
 M O N java/lang/Math P Q sqrt (D)D dodai_canh1_canh3 dodai_canh2_canh3 kiemtra_thanghang (DDD)I a b c StackMapTable chuvi (DDD)D dientich?Π       main ([Ljava/lang/String;)V b +c : Kiem tra 3 diem co thang hang hay khong
 / d e 3 println g  d : Tinh khoang cach giua 2 diem i )e : Tinh chu vi va dien tich cua tam giac k Nhap vao 3 diem toa do :
  
  n  
  p J K
  r R K
  t S K
  v T U x 3 diem thang hang z 3 diem khong thang hang | java/lang/StringBuilder ~ &Khoang cach giua 2 diem thu1 va thu2 :
 {   3
 {    append (D)Ljava/lang/StringBuilder;
 {    toString ()Ljava/lang/String;  &Khoang cach giua 2 diem thu1 va thu3 :  &Khoang cach giua 2 diem thu2 va thu3 :  Chu vi tam giac :
   Z [  Dien tich tam giac :
   \ [ args [Ljava/lang/String; check I  
SourceFile 
Point.java !                    	  
   3     *· ±       
      
                  
   >     *'΅ ±       
                              
   /     *΄ ―                             
   >     *'΅ ±       
                              
   /     *΄ ―                            
   θ     l» Y² · %N² (,Ά .*-Ά 4Ά 7² (9Ά .*-Ά 4Ά ;² (=Ά .+-Ά 4Ά 7² (?Ά .+-Ά 4Ά ;² (AΆ .,-Ά 4Ά 7² (CΆ .,-Ά 4Ά ;±       :           #  + ! 3 " ; # C $ K & S ' [ ( c ) k *    *    l E      l F     l G    a H I   J K  
   _     ++΄ *΄ g+΄ *΄ gk+΄ *΄ g+΄ *΄ gkcΈ L―           -        + E      + F    R K  
   _     ++΄ *΄ g+΄ *΄ gk+΄ *΄ g+΄ *΄ gkcΈ L―           1        + E      + G    S K  
   _     +*΄ +΄ g*΄ +΄ gk*΄ +΄ g*΄ +΄ gkcΈ L―           5        + F      + G    T U  
   k     &(c &c( (c& ¬¬       
    9  :          V       W      X   Y      Z [  
   E     &(cc―           >          V       W      X    \ [  
   a     # ]&(cc&(cgk(c&gk&c(gkΈ Lk―           B         # V      # W     # X   	 _ `  
  ζ    ² (aΆ c² (fΆ c² (hΆ c² (jΆ c» Y· lL» Y· lM» Y· lN+,-Έ m+,Έ o9+-Έ q9,-Έ s9Έ u6

  ² (wΆ c§ 
 ² (yΆ c² (» {Y}· Ά Ά Ά c² (» {Y· Ά Ά Ά c² (» {Y· Ά Ά Ά c
 ?² (» {Y· Έ Ά Ά Ά c² (» {Y· Έ Ά Ά Ά c±       V    F  G  H  I   K ( L 0 M 8 N > O E P L Q S R ^ S o T | V  W ͺ X Α Z Ζ [ δ \ ^    R        ( Ϋ E   0 Σ F   8 Λ G   E Ύ V   L · W   S ° X   ^ ₯   
 Y    ? o       ϋ       