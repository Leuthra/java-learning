package basic;

/**
 * Kelas VariableScope mendemonstrasikan cakupan (scope) variabel
 * di dalam Java: Static, Method, dan Block level.
 */
public class VariableScope {
    
    // 1. Static Variable (Class Scope)
    // Variabel ini dikenal di seluruh kelas.
    static int nilaiStatik = 100;

    public static void main(String[] args) {
        // 2. Local Variable (Method Scope)
        // Variabel ini dikenal di seluruh method main().
        int nilaiMethod = 10;
        
        System.out.println("=== Method Scope ===");
        System.out.printf("Nilai Statik: %d%n", nilaiStatik);
        System.out.printf("Nilai Method: %d%n%n", nilaiMethod);

        {
            // 3. Block Variable (Block Scope)
            // Variabel ini hanya dikenal di dalam blok kurung kurawal ini.
            int nilaiBlok = 50;
            
            System.out.println("=== Inside First Block ===");
            System.out.printf("Nilai Method (Masih terbaca): %d%n", nilaiMethod);
            System.out.printf("Nilai Blok: %d%n", nilaiBlok);

            {
                // Nested Block
                int nilaiNested = 999;
                System.out.println("--- Inside Nested Block ---");
                System.out.printf("Nilai Method: %d, Blok: %d, Nested: %d%n", 
                                  nilaiMethod, nilaiBlok, nilaiNested);
            }
            // System.out.println(nilaiNested); // ERROR: nilaiNested sudah tidak dikenal
        }
        
        // System.out.println(nilaiBlok); // ERROR: nilaiBlok sudah tidak dikenal
        
        System.out.println("=== Back to Method Scope ===");
        System.out.printf("Nilai Method masih ada: %d%n", nilaiMethod);
    }
}
