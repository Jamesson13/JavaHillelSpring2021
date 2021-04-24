package Lesson9HW;
import java.util.Collection;
import java.util.Iterator;

public class Users implements iUsers{
    private ListUser head;
    private ListUser tail;

    public boolean addBack(String value){
        ListUser a = new ListUser();
        a.data = value;
        if(tail==null){
            head = a;
            tail=a;
        }else {
            tail.next = a;
            tail = a;
        }
        return false;
    }
    public boolean addFront(String value){
        ListUser a  = new ListUser();
        a.data = value;
        if(head==null){
            head=a;
            tail=a;
        }else {
            a.next=head;
            head=a;
        }
        return false;
    }

    public void printList(){
        ListUser t=head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public void deleteValue(String value){
        if(head==null)
            return;
        if (head==tail){
            head= null;
            tail= null;
        }
        if(head.data==value){
            head = head.next;
            return;
        }
        ListUser d =head;
        while (d.next!=null) {
            if (d.next.data == value) {
                if (tail == d.next) {
                    tail = d;
                }
                d.next = d.next.next;
                return;
            }
            d = d.next;
        }
    }

    public void deleteIndex(int index){
        int check = 0;
        if(head==null)
            return;
        if (head==tail) {
            head = null;
            tail = null;
        }
        if(check==index){
            head=head.next;
        return;
        }
        ListUser t = head;
        while (t.next!=null){
            check++;
            if(check==index){
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }

    public boolean addArray(String[] value){
        for (int i =0;i<value.length;i++){
            ListUser a = new ListUser();
            a.data = value[i];
            if(tail==null){
                head = a;
                tail=a;
            }else {
                tail.next = a;
                tail = a;
            }

        }
        return false;
    }

    public int getSize(){
        int size = 0;
        ListUser t = head;
        while (t!=null){
            t=t.next;
            size++;
        }
        return size++;
    }

    public String getValue(int index){
        int size=0;
        ListUser t=head;
        while (t!=null){
            if(size!=index){
                size++;
            }else {
                System.out.println(t.data);
                break;
            }
            t=t.next;
        }
        return t.data;
    }
    public boolean clear(){
        head = null;
        tail = null;
        return false;
    }

    public boolean contains(String value){
        ListUser t = head;
        while (t!=null){
            if(t.data!=value){
                t=t.next;
            }else {
                t=t.next;
            }
        }
        return true;
    }

    public boolean addColl(Collection<String> coll){
        Iterator<String> j = coll.iterator();
        for(int i = 0;i<coll.size();i++){
            ListUser t = new ListUser();
            t.data = j.next();
            if(tail==null){
                head = t;
                tail=t;
            }else {
                tail.next = t;
                tail = t;
            }

        }
        return false;
    }

    public boolean trim(){
        ListUser t = head;
        while (t.next != null) {
            if(t.data==null){
                head = t.next;
            }
            if (t.next.data == null) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
            }
            t = t.next;
        }
        return false;
    }
    public boolean compare(Collection<String> coll){
        if(getSize()!=coll.size()){
            return false;
        }
        ListUser t = head;
        Iterator<String> i = coll.iterator();
        while (t.next!=null){
            if(t.data != i.next()){
                return false;
            }
            t = t.next;
        }

        return true;
    }


}



