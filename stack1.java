????   = f  stack1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lstack1; showpush (Ljava/util/Stack;I)V
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;
    java/util/Stack   push &(Ljava/lang/Object;)Ljava/lang/Object;	    java/lang/System   ! out Ljava/io/PrintStream; # java/lang/StringBuilder % push(
 " '  ( (Ljava/lang/String;)V
 " * + , append (I)Ljava/lang/StringBuilder; . )
 " 0 + 1 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 " 3 4 5 toString ()Ljava/lang/String;
 7 9 8 java/io/PrintStream : ( println < stack: 
 " > + ? -(Ljava/lang/Object;)Ljava/lang/StringBuilder; st Ljava/util/Stack; a I showpop (Ljava/util/Stack;)V G pop -> 
 7 I J ( print
  L M N pop ()Ljava/lang/Object;
 7 P : Q (Ljava/lang/Object;)V Ljava/lang/Integer; main ([Ljava/lang/String;)V
  	
  W  
  Y D E [ empty stack ] java/util/EmptyStackException args [Ljava/lang/String; e Ljava/util/EmptyStackException; StackMapTable _ 
SourceFile stack1.java !               /     *? ?    
                           {     ;*? ? W? ? "Y$? &? )-? /? 2? 6? ? "Y;? &*? =? 2? 6?    
        	  $ 	 : 
        ; @ A     ; B C   D E     r     .? F? H*? K? L? +? O? ? "Y;? &*? =? 2? 6?    
              -         . @ A     B R  	 S T     ?     M? Y? UL? ? "Y;? &+? =? 2? 6+*? V+B? V+c? V+? X+? X+? X+? X? M? Z? 6?  < @ C \  
   2         $  *  0  4  8  <  @  D   L "         M ^ _    E @ A  D  ` a  b    ? C  c   \  d    e