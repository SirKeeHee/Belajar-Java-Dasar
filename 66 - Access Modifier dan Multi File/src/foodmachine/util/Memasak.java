package foodmachine.util;

public class Memasak {
        public static void dagingPublic(){
            System.out.println("Kelas Terbuka: Memasak : public");
        }

        private static void dagingPrivate(){
            System.out.println("Kelas Terbuka: Memasak : private");
        }

        static void dagingDefault(){
            System.out.println("Kelas Terbuka: Memasak : default");
        }

        protected static void dagingProtected(){
            System.out.println("Kelas Terbuka: Memasak : protected");
        }




}
