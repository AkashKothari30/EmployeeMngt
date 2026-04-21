#!/bin/bash
echo "Enter Principal:"
read p
echo "Enter Rate:"
read r
echo "Enter Time:"
read t
si=$(echo "($p * $r * $t) / 100" | bc)
echo "Simple Interest: $si"
