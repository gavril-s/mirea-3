-- Copyright (C) 1991-2013 Altera Corporation
-- Your use of Altera Corporation's design tools, logic functions 
-- and other software and tools, and its AMPP partner logic 
-- functions, and any output files from any of the foregoing 
-- (including device programming or simulation files), and any 
-- associated documentation or information are expressly subject 
-- to the terms and conditions of the Altera Program License 
-- Subscription Agreement, Altera MegaCore Function License 
-- Agreement, or other applicable license agreement, including, 
-- without limitation, that your use is for the sole purpose of 
-- programming logic devices manufactured by Altera and sold by 
-- Altera or its authorized distributors.  Please refer to the 
-- applicable agreement for further details.

-- VENDOR "Altera"
-- PROGRAM "Quartus II 64-Bit"
-- VERSION "Version 13.1.0 Build 162 10/23/2013 SJ Web Edition"

-- DATE "11/28/2023 01:54:46"

-- 
-- Device: Altera EP4CGX15BF14C6 Package FBGA169
-- 

-- 
-- This VHDL file should be used for ModelSim-Altera (VHDL) only
-- 

LIBRARY CYCLONEIV;
LIBRARY IEEE;
USE CYCLONEIV.CYCLONEIV_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	lab2_2 IS
    PORT (
	i : IN std_logic;
	s1 : IN std_logic;
	s0 : IN std_logic;
	y3 : OUT std_logic;
	y2 : OUT std_logic;
	y1 : OUT std_logic;
	y0 : OUT std_logic
	);
END lab2_2;

-- Design Ports Information
-- y3	=>  Location: PIN_M4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- y2	=>  Location: PIN_M6,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- y1	=>  Location: PIN_N4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- y0	=>  Location: PIN_L7,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- s0	=>  Location: PIN_L4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- i	=>  Location: PIN_N6,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- s1	=>  Location: PIN_L11,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF lab2_2 IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL ww_i : std_logic;
SIGNAL ww_s1 : std_logic;
SIGNAL ww_s0 : std_logic;
SIGNAL ww_y3 : std_logic;
SIGNAL ww_y2 : std_logic;
SIGNAL ww_y1 : std_logic;
SIGNAL ww_y0 : std_logic;
SIGNAL \y3~output_o\ : std_logic;
SIGNAL \y2~output_o\ : std_logic;
SIGNAL \y1~output_o\ : std_logic;
SIGNAL \y0~output_o\ : std_logic;
SIGNAL \s1~input_o\ : std_logic;
SIGNAL \i~input_o\ : std_logic;
SIGNAL \s0~input_o\ : std_logic;
SIGNAL \y3~0_combout\ : std_logic;
SIGNAL \y2~0_combout\ : std_logic;
SIGNAL \y1~0_combout\ : std_logic;
SIGNAL \y0~0_combout\ : std_logic;

BEGIN

ww_i <= i;
ww_s1 <= s1;
ww_s0 <= s0;
y3 <= ww_y3;
y2 <= ww_y2;
y1 <= ww_y1;
y0 <= ww_y0;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;

-- Location: IOOBUF_X8_Y0_N2
\y3~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \y3~0_combout\,
	devoe => ww_devoe,
	o => \y3~output_o\);

-- Location: IOOBUF_X12_Y0_N9
\y2~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \y2~0_combout\,
	devoe => ww_devoe,
	o => \y2~output_o\);

-- Location: IOOBUF_X10_Y0_N9
\y1~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \y1~0_combout\,
	devoe => ww_devoe,
	o => \y1~output_o\);

-- Location: IOOBUF_X14_Y0_N2
\y0~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \y0~0_combout\,
	devoe => ww_devoe,
	o => \y0~output_o\);

-- Location: IOIBUF_X31_Y0_N1
\s1~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_s1,
	o => \s1~input_o\);

-- Location: IOIBUF_X12_Y0_N1
\i~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_i,
	o => \i~input_o\);

-- Location: IOIBUF_X8_Y0_N8
\s0~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_s0,
	o => \s0~input_o\);

-- Location: LCCOMB_X11_Y1_N8
\y3~0\ : cycloneiv_lcell_comb
-- Equation(s):
-- \y3~0_combout\ = (\s1~input_o\ & (\i~input_o\ & \s0~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1000000010000000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \s1~input_o\,
	datab => \i~input_o\,
	datac => \s0~input_o\,
	combout => \y3~0_combout\);

-- Location: LCCOMB_X11_Y1_N2
\y2~0\ : cycloneiv_lcell_comb
-- Equation(s):
-- \y2~0_combout\ = (\s1~input_o\ & (\i~input_o\ & !\s0~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000100000001000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \s1~input_o\,
	datab => \i~input_o\,
	datac => \s0~input_o\,
	combout => \y2~0_combout\);

-- Location: LCCOMB_X11_Y1_N4
\y1~0\ : cycloneiv_lcell_comb
-- Equation(s):
-- \y1~0_combout\ = (!\s1~input_o\ & (\i~input_o\ & \s0~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0100000001000000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \s1~input_o\,
	datab => \i~input_o\,
	datac => \s0~input_o\,
	combout => \y1~0_combout\);

-- Location: LCCOMB_X11_Y1_N22
\y0~0\ : cycloneiv_lcell_comb
-- Equation(s):
-- \y0~0_combout\ = (!\s1~input_o\ & (\i~input_o\ & !\s0~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000010000000100",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \s1~input_o\,
	datab => \i~input_o\,
	datac => \s0~input_o\,
	combout => \y0~0_combout\);

ww_y3 <= \y3~output_o\;

ww_y2 <= \y2~output_o\;

ww_y1 <= \y1~output_o\;

ww_y0 <= \y0~output_o\;
END structure;


