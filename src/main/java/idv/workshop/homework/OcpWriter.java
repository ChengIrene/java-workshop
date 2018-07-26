package idv.workshop.homework;

abstract public class OcpWriter implements OcpWritable {
    // void doWrite (String w);  要加上public,然後要不就實作方法,要不就加上abstract
    // void doWrite ();  要加上abstract,不然就是寫出方法
    // void doWrite (String w) { }  必須為public
    void doWrite() {}  //正確答案
}
