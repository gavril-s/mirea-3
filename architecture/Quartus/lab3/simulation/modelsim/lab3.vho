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

-- DATE "11/28/2023 02:20:32"

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

ENTITY 	lab3 IS
    PORT (
	s : OUT std_logic_vector(3 DOWNTO 0);
	a : IN std_logic_vector(3 DOWNTO 0);
	b : IN std_logic_vector(3 DOWNTO 0)
	);
END lab3;

-- Design Ports Information
-- s[3]	=>  Location: PIN_A12,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- s[2]	=>  Location: PIN_B6,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- s[1]	=>  Location: PIN_N8,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- s[0]	=>  Location: PIN_N11,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- b[3]	=>  Location: PIN_N6,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- a[3]	=>  Location: PIN_M4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- b[2]	=>  Location: PIN_K12,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- a[2]	=>  Location: PIN_N4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- b[1]	=>  Location: PIN_N9,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- a[1]	=>  Location: PIN_L7,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- b[0]	=>  Location: PIN_L5,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- a[0]	=>  Location: PIN_K9,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF lab3 IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL ww_s : std_logic_vector(3 DOWNTO 0);
SIGNAL ww_a : std_logic_vector(3 DOWNTO 0);
SIGNAL ww_b : std_logic_vector(3 DOWNTO 0);
SIGNAL \s[3]~output_o\ : std_logic;
SIGNAL \s[2]~output_o\ : std_logic;
SIGNAL \s[1]~output_o\ : std_logic;
SIGNAL \s[0]~output_o\ : std_logic;
SIGNAL \b[3]~input_o\ : std_logic;
SIGNAL \a[3]~input_o\ : std_logic;
SIGNAL \a[2]~input_o\ : std_logic;
SIGNAL \b[2]~input_o\ : std_logic;
SIGNAL \b[1]~input_o\ : std_logic;
SIGNAL \a[1]~input_o\ : std_logic;
SIGNAL \b[0]~input_o\ : std_logic;
SIGNAL \a[0]~input_o\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[2]~5\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[3]~6_combout\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[2]~4_combout\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[1]~2_combout\ : std_logic;
SIGNAL \inst|LPM_ADD_SUB_component|auto_generated|result[0]~0_combout\ : std_logic;

BEGIN

s <= ww_s;
ww_a <= a;
ww_b <= b;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;

-- Location: IOOBUF_X20_Y31_N9
\s[3]~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|LPM_ADD_SUB_component|auto_generated|result[3]~6_combout\,
	devoe => ww_devoe,
	o => \s[3]~output_o\);

-- Location: IOOBUF_X14_Y31_N9
\s[2]~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|LPM_ADD_SUB_component|auto_generated|result[2]~4_combout\,
	devoe => ww_devoe,
	o => \s[2]~output_o\);

-- Location: IOOBUF_X20_Y0_N9
\s[1]~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|LPM_ADD_SUB_component|auto_generated|result[1]~2_combout\,
	devoe => ww_devoe,
	o => \s[1]~output_o\);

-- Location: IOOBUF_X26_Y0_N2
\s[0]~output\ : cycloneiv_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|LPM_ADD_SUB_component|auto_generated|result[0]~0_combout\,
	devoe => ww_devoe,
	o => \s[0]~output_o\);

-- Location: IOIBUF_X12_Y0_N1
\b[3]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_b(3),
	o => \b[3]~input_o\);

-- Location: IOIBUF_X8_Y0_N1
\a[3]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_a(3),
	o => \a[3]~input_o\);

-- Location: IOIBUF_X10_Y0_N8
\a[2]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_a(2),
	o => \a[2]~input_o\);

-- Location: IOIBUF_X33_Y11_N8
\b[2]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_b(2),
	o => \b[2]~input_o\);

-- Location: IOIBUF_X20_Y0_N1
\b[1]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_b(1),
	o => \b[1]~input_o\);

-- Location: IOIBUF_X14_Y0_N1
\a[1]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_a(1),
	o => \a[1]~input_o\);

-- Location: IOIBUF_X14_Y0_N8
\b[0]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_b(0),
	o => \b[0]~input_o\);

-- Location: IOIBUF_X22_Y0_N1
\a[0]~input\ : cycloneiv_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_a(0),
	o => \a[0]~input_o\);

-- Location: LCCOMB_X17_Y2_N0
\inst|LPM_ADD_SUB_component|auto_generated|result[0]~0\ : cycloneiv_lcell_comb
-- Equation(s):
-- \inst|LPM_ADD_SUB_component|auto_generated|result[0]~0_combout\ = (\b[0]~input_o\ & (\a[0]~input_o\ $ (VCC))) # (!\b[0]~input_o\ & (\a[0]~input_o\ & VCC))
-- \inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\ = CARRY((\b[0]~input_o\ & \a[0]~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110011010001000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \b[0]~input_o\,
	datab => \a[0]~input_o\,
	datad => VCC,
	combout => \inst|LPM_ADD_SUB_component|auto_generated|result[0]~0_combout\,
	cout => \inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\);

-- Location: LCCOMB_X17_Y2_N2
\inst|LPM_ADD_SUB_component|auto_generated|result[1]~2\ : cycloneiv_lcell_comb
-- Equation(s):
-- \inst|LPM_ADD_SUB_component|auto_generated|result[1]~2_combout\ = (\b[1]~input_o\ & ((\a[1]~input_o\ & (\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\ & VCC)) # (!\a[1]~input_o\ & (!\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\)))) # 
-- (!\b[1]~input_o\ & ((\a[1]~input_o\ & (!\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\)) # (!\a[1]~input_o\ & ((\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\) # (GND)))))
-- \inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\ = CARRY((\b[1]~input_o\ & (!\a[1]~input_o\ & !\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\)) # (!\b[1]~input_o\ & ((!\inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\) # 
-- (!\a[1]~input_o\))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1001011000010111",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \b[1]~input_o\,
	datab => \a[1]~input_o\,
	datad => VCC,
	cin => \inst|LPM_ADD_SUB_component|auto_generated|result[0]~1\,
	combout => \inst|LPM_ADD_SUB_component|auto_generated|result[1]~2_combout\,
	cout => \inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\);

-- Location: LCCOMB_X17_Y2_N4
\inst|LPM_ADD_SUB_component|auto_generated|result[2]~4\ : cycloneiv_lcell_comb
-- Equation(s):
-- \inst|LPM_ADD_SUB_component|auto_generated|result[2]~4_combout\ = ((\a[2]~input_o\ $ (\b[2]~input_o\ $ (!\inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\)))) # (GND)
-- \inst|LPM_ADD_SUB_component|auto_generated|result[2]~5\ = CARRY((\a[2]~input_o\ & ((\b[2]~input_o\) # (!\inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\))) # (!\a[2]~input_o\ & (\b[2]~input_o\ & 
-- !\inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110100110001110",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \a[2]~input_o\,
	datab => \b[2]~input_o\,
	datad => VCC,
	cin => \inst|LPM_ADD_SUB_component|auto_generated|result[1]~3\,
	combout => \inst|LPM_ADD_SUB_component|auto_generated|result[2]~4_combout\,
	cout => \inst|LPM_ADD_SUB_component|auto_generated|result[2]~5\);

-- Location: LCCOMB_X17_Y2_N6
\inst|LPM_ADD_SUB_component|auto_generated|result[3]~6\ : cycloneiv_lcell_comb
-- Equation(s):
-- \inst|LPM_ADD_SUB_component|auto_generated|result[3]~6_combout\ = \b[3]~input_o\ $ (\a[3]~input_o\ $ (\inst|LPM_ADD_SUB_component|auto_generated|result[2]~5\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1001011010010110",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \b[3]~input_o\,
	datab => \a[3]~input_o\,
	cin => \inst|LPM_ADD_SUB_component|auto_generated|result[2]~5\,
	combout => \inst|LPM_ADD_SUB_component|auto_generated|result[3]~6_combout\);

ww_s(3) <= \s[3]~output_o\;

ww_s(2) <= \s[2]~output_o\;

ww_s(1) <= \s[1]~output_o\;

ww_s(0) <= \s[0]~output_o\;
END structure;


