
import com.sun.org.apache.bcel.internal.generic.LoadClass;
import employee.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList();
//
//        list.add("Nume");
//        list.add("Nume1");
//        list.add("Nume2");
//        list.add("Nume3");
//
//        for(int i = 0; i< list.size(); i++) {
//           String nume = (String) list.get(i); // ClassCast
//        }

//        Object a = new Integer(2);
//
//        String i = (String) a;
//
//        Object programator = new Programator(); // polimorfism
//
//        Object contabil = new Contabil();
//
//        Programator pr = (Programator) programator;


//        Set<Integer> contabils = new HashSet<>();
//
//         Set<Integer> a = new HashSet<>();
//         a.add(new Integer(2));
////         a.add(new String());
//
//
//        Set<String> set = new HashSet<>();
//
//        Set<Programator> pr = new HashSet<>();
//
//        pr.contains(new Programator());
//
        List<Programator> lsit = new ArrayList<>();
//
//        Programator prog = lsit.get(0);
//
//
//        for(Programator programator : lsit) {
//
//        }
//
//        Map<String, Programator> map = new HashMap<>();
////
////        map.put("key1", new Programator());
////
////
//        ArrayDeque<Programator> v = new ArrayDeque<>(); // peek, poll


//        Contabil c = (Contabil) map.get("key1"); // ClassCastException

//        LocalDate d = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
//        if(LocalTime.now().equals(LocalTime.now()) ) {
//            for(Contabil contabil : contabils) {
//                Contabil contabil1 =  contabil;
//            }
//        }


//        CustomQueue<Contabil> customQueue = new CustomQueue();
//
//        customQueue.offer(new Contabil());
//        customQueue.offer(new Contabil());
//
//        CustomMap<String, Programator> customMap = new CustomMap<>();
//
//        customMap.put("key1", new Programator());
//
//        Programator n = customMap.get("key1");



//        Tabla<Square> tabla = new Tabla<>(new Square());
//
//
//        tabla.diseneazaFigura();


        Shape<Triangle> triangleShape = new Triangle<>();

        Triangle triangle = triangleShape.draw();

    }
}