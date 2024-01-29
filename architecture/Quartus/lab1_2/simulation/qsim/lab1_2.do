onerror {exit -code 1}
vlib work
vlog -work work lab1_2.vo
vlog -work work Waveform.vwf.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.lab1_2_vlg_vec_tst -voptargs="+acc"
vcd file -direction lab1_2.msim.vcd
vcd add -internal lab1_2_vlg_vec_tst/*
vcd add -internal lab1_2_vlg_vec_tst/i1/*
run -all
quit -f
