����   = d  stack2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lstack2; evaluatePostfix (Ljava/lang/String;)I  java/util/Stack
  	
    java/lang/String   charAt (I)C
    java/lang/Character   isDigit (C)Z
   " ! java/lang/Integer # $ valueOf (I)Ljava/lang/Integer;
  & ' ( push &(Ljava/lang/Object;)Ljava/lang/Object;
  * + , pop ()Ljava/lang/Object;
   . / 0 intValue ()I
  2 3 0 length exp Ljava/lang/String; Ljava/util/Stack; i I c C val1 val2 LocalVariableTypeTable &Ljava/util/Stack<Ljava/lang/Integer;>; StackMapTable main ([Ljava/lang/String;)V C 221*+9-	 E G F java/lang/System H I out Ljava/io/PrintStream; K java/lang/StringBuilder M postfix evaluation: 
 J O  P (Ljava/lang/String;)V
  R  
 J T U V append (I)Ljava/lang/StringBuilder;
 J X Y Z toString ()Ljava/lang/String;
 \ ^ ] java/io/PrintStream _ P println args [Ljava/lang/String; 
SourceFile stack2.java !               /     *� �    
                          |     �� Y� L=� �*� >� � +0d� � %W� +� )�  � -6+� )�  � -6�    c   *   /   V   &   c   6   c   F+`� � %W� 0+d� � %W�  +l� � %W� +h� � %W�*� 1��`+� )�  � -�    
   :        
     )  5  A  h  x  �  �  �  �     >    � 4 5    �  6  
 � 7 8   � 9 :  5 p ; 8  A d < 8  =      �  >  ?    �  � � >�  	 @ A     Y     BL� D� JYL� N+� Q� S� W� [�    
       "  #  $         ` a     4 5   b    c