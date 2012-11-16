/*
 * Copyright 2012 Adrian Toncean
 * 
 * This file is part of OCLEx.
 *
 * OCLEx is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OCLEx is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OCLEx. If not, see <http://www.gnu.org/licenses/>.
 */

package pso;

public class PSOParam {
	final int nParticles;
	final float atenuator;
 final float social;
 final int connectivity;
 
 PSOParam(int nParticles, float atenuator, float social, int connectivity) {
 	this.nParticles = nParticles;
 	this.atenuator = atenuator;
 	this.social = social;
 	this.connectivity = connectivity;
 }
}