# Proxy Design Pattern (Java)

**Proxy** create a proxy "agent" from a real object.
![](https://github.com/shamy1st/design-pattern-proxy/blob/main/uml.png)
### Problem: 
You have **Library** class with multiple **Ebook**, at any time you want to open a specific **Ebook**, the current implementation loads all **Ebooks** in memory and then open your request **Ebook** which is so expensive.

    public class Main {
        public static void main(String[] args) {
            Library library = new Library();
            String[] fileNames = { "ebook1", "ebook2", "ebook3" };
            for(String fileName : fileNames) {
                library.add(new Ebook(fileName));
            }
            library.openEbook("ebook1");
        }
    }

    public class Library {
        private Map<String, Ebook> ebooks = new HashMap<>();
        
        public void add(Ebook ebook) {
            ebooks.put(ebook.getFileName(), ebook);
        }
        
        public void openEbook(String fileName) {
            ebooks.get(fileName).show();
        }
    }

    public class Ebook {
        private String fileName;

        public Ebook(String fileName) {
            this.fileName = fileName;
            load();
        }
        
        private void load() {
            System.out.println("Loading the ebook " + fileName);
        }
        
        @Override
        public void show() {
            System.out.println("Showing the ebook " + fileName);
        }

        @Override
        public String getFileName() {
            return fileName;
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-proxy/blob/main/uml-solution.png)
