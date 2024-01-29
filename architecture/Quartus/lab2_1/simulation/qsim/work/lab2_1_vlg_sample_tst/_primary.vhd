library verilog;
use verilog.vl_types.all;
entity lab2_1_vlg_sample_tst is
    port(
        I               : in     vl_logic;
        S0              : in     vl_logic;
        S1              : in     vl_logic;
        sampler_tx      : out    vl_logic
    );
end lab2_1_vlg_sample_tst;
