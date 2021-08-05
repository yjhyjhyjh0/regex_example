# regex_example
Quick notes for java regex

# Syntax definition
http://120.105.184.250/cswang/thit/Linux/RegularExpression.htm

# Online quick exam
https://regexone.com/
 
## 語法定義答詢  

### S0-跳脫字元
跳脫字元\    
例如    
. = 任一字元    
\. = 找尋.   

### S1-數量定義詞 (要幾個)
這六個數量定義夠用了 記得有數量定義即可  
? -> 一個字元或沒有  
*  -> 任意數目或沒有  
+  -> 一個字元或以上  
a{N} -> N個字元  
a{N, } -> 至少N個字元  
a{3,5} -> a至少出現3次 最多5次  
a{3} -> a會出現三次  
a+ (one or more a's),  
[abc]+ (one or more of any a, b, or c character) and 
.* (zero or more of any character).

### S2-位置定義 Position Metacharacter
^ -> 代表字串開頭  
$ -> 代表字串結尾

### S3-對應定義 Match Metacharacter
. ->代表任一個字元  
[...] -> 代表任此些字元都可 例如[abcd] or [a-d] 都代表這四個字元可以  
[^...] -> 代表不能是此些字元 例如[^abc] = a,b,c均不行  

### S4-簡寫定義 Shorthand Metacharacter
\d ->對應0-9的任一數字(= [0-9])  
\D -> 對應非數字的任一字元(=[^0-9])  
\f -> 對應換頁字元  
\n -> 對應換行字元   
\r -> 對應歸正字元  
\s -> 對應空白字元，對等於 [ \f\n\r\t\v]  
\S -> 對應非空白字元，對等於 [^ \f\n\r\t\v]    
\t -> 對應 tab字元  
\v -> 對應垂直 tab字元  
\w -> 對應任何文數字元包括"_"，對等於 [a-zA-Z0-9_]    
\W -> 對應任何非文數字元，對等於 [^a-zA-Z0-9_]

### S5-其他定義 Other
| -> 邏輯or  
(pattern) 使用括號將pattern分組並提供記憶的功能，提供往後運算時再存取被括住的運算式功能。  
當有許多括號在pattern中使用時，被括住的運算式由左至右，可依序用$1、$2‧‧‧$9存取。  
例如，"(a(bc)(d))" 運算式，被括號的運算式將有如下的對應$1="abcd"，$2="bc"，$3="d"。