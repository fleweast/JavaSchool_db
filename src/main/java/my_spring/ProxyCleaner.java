package my_spring;

public class ProxyCleaner implements Cleaner {
    @Override
    public void clean() {
        Cleaner cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
