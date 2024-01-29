library verilog;
use verilog.vl_types.all;
entity lab3 is
    port(
        s               : out    vl_logic_vector(3 downto 0);
        a               : in     vl_logic_vector(3 downto 0);
        b               : in     vl_logic_vector(3 downto 0)
    );
end lab3;
