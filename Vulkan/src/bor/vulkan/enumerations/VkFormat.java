package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkFormat
 * @author Alessandro Borges

 */
public class VkFormat extends IntEnum<VkFormat> {
	public static final VkFormat VK_FORMAT_UNDEFINED = new VkFormat("VK_FORMAT_UNDEFINED", 0, 0);
	public static final VkFormat VK_FORMAT_R4G4_UNORM_PACK8 = new VkFormat("VK_FORMAT_R4G4_UNORM_PACK8", 1, 1);
	public static final VkFormat VK_FORMAT_R4G4B4A4_UNORM_PACK16 = new VkFormat("VK_FORMAT_R4G4B4A4_UNORM_PACK16", 2, 2);
	public static final VkFormat VK_FORMAT_B4G4R4A4_UNORM_PACK16 = new VkFormat("VK_FORMAT_B4G4R4A4_UNORM_PACK16", 3, 3);
	public static final VkFormat VK_FORMAT_R5G6B5_UNORM_PACK16 = new VkFormat("VK_FORMAT_R5G6B5_UNORM_PACK16", 4, 4);
	public static final VkFormat VK_FORMAT_B5G6R5_UNORM_PACK16 = new VkFormat("VK_FORMAT_B5G6R5_UNORM_PACK16", 5, 5);
	public static final VkFormat VK_FORMAT_R5G5B5A1_UNORM_PACK16 = new VkFormat("VK_FORMAT_R5G5B5A1_UNORM_PACK16", 6, 6);
	public static final VkFormat VK_FORMAT_B5G5R5A1_UNORM_PACK16 = new VkFormat("VK_FORMAT_B5G5R5A1_UNORM_PACK16", 7, 7);
	public static final VkFormat VK_FORMAT_A1R5G5B5_UNORM_PACK16 = new VkFormat("VK_FORMAT_A1R5G5B5_UNORM_PACK16", 8, 8);
	public static final VkFormat VK_FORMAT_R8_UNORM = new VkFormat("VK_FORMAT_R8_UNORM", 9, 9);
	public static final VkFormat VK_FORMAT_R8_SNORM = new VkFormat("VK_FORMAT_R8_SNORM", 10, 10);
	public static final VkFormat VK_FORMAT_R8_USCALED = new VkFormat("VK_FORMAT_R8_USCALED", 11, 11);
	public static final VkFormat VK_FORMAT_R8_SSCALED = new VkFormat("VK_FORMAT_R8_SSCALED", 12, 12);
	public static final VkFormat VK_FORMAT_R8_UINT = new VkFormat("VK_FORMAT_R8_UINT", 13, 13);
	public static final VkFormat VK_FORMAT_R8_SINT = new VkFormat("VK_FORMAT_R8_SINT", 14, 14);
	public static final VkFormat VK_FORMAT_R8_SRGB = new VkFormat("VK_FORMAT_R8_SRGB", 15, 15);
	public static final VkFormat VK_FORMAT_R8G8_UNORM = new VkFormat("VK_FORMAT_R8G8_UNORM", 16, 16);
	public static final VkFormat VK_FORMAT_R8G8_SNORM = new VkFormat("VK_FORMAT_R8G8_SNORM", 17, 17);
	public static final VkFormat VK_FORMAT_R8G8_USCALED = new VkFormat("VK_FORMAT_R8G8_USCALED", 18, 18);
	public static final VkFormat VK_FORMAT_R8G8_SSCALED = new VkFormat("VK_FORMAT_R8G8_SSCALED", 19, 19);
	public static final VkFormat VK_FORMAT_R8G8_UINT = new VkFormat("VK_FORMAT_R8G8_UINT", 20, 20);
	public static final VkFormat VK_FORMAT_R8G8_SINT = new VkFormat("VK_FORMAT_R8G8_SINT", 21, 21);
	public static final VkFormat VK_FORMAT_R8G8_SRGB = new VkFormat("VK_FORMAT_R8G8_SRGB", 22, 22);
	public static final VkFormat VK_FORMAT_R8G8B8_UNORM = new VkFormat("VK_FORMAT_R8G8B8_UNORM", 23, 23);
	public static final VkFormat VK_FORMAT_R8G8B8_SNORM = new VkFormat("VK_FORMAT_R8G8B8_SNORM", 24, 24);
	public static final VkFormat VK_FORMAT_R8G8B8_USCALED = new VkFormat("VK_FORMAT_R8G8B8_USCALED", 25, 25);
	public static final VkFormat VK_FORMAT_R8G8B8_SSCALED = new VkFormat("VK_FORMAT_R8G8B8_SSCALED", 26, 26);
	public static final VkFormat VK_FORMAT_R8G8B8_UINT = new VkFormat("VK_FORMAT_R8G8B8_UINT", 27, 27);
	public static final VkFormat VK_FORMAT_R8G8B8_SINT = new VkFormat("VK_FORMAT_R8G8B8_SINT", 28, 28);
	public static final VkFormat VK_FORMAT_R8G8B8_SRGB = new VkFormat("VK_FORMAT_R8G8B8_SRGB", 29, 29);
	public static final VkFormat VK_FORMAT_B8G8R8_UNORM = new VkFormat("VK_FORMAT_B8G8R8_UNORM", 30, 30);
	public static final VkFormat VK_FORMAT_B8G8R8_SNORM = new VkFormat("VK_FORMAT_B8G8R8_SNORM", 31, 31);
	public static final VkFormat VK_FORMAT_B8G8R8_USCALED = new VkFormat("VK_FORMAT_B8G8R8_USCALED", 32, 32);
	public static final VkFormat VK_FORMAT_B8G8R8_SSCALED = new VkFormat("VK_FORMAT_B8G8R8_SSCALED", 33, 33);
	public static final VkFormat VK_FORMAT_B8G8R8_UINT = new VkFormat("VK_FORMAT_B8G8R8_UINT", 34, 34);
	public static final VkFormat VK_FORMAT_B8G8R8_SINT = new VkFormat("VK_FORMAT_B8G8R8_SINT", 35, 35);
	public static final VkFormat VK_FORMAT_B8G8R8_SRGB = new VkFormat("VK_FORMAT_B8G8R8_SRGB", 36, 36);
	public static final VkFormat VK_FORMAT_R8G8B8A8_UNORM = new VkFormat("VK_FORMAT_R8G8B8A8_UNORM", 37, 37);
	public static final VkFormat VK_FORMAT_R8G8B8A8_SNORM = new VkFormat("VK_FORMAT_R8G8B8A8_SNORM", 38, 38);
	public static final VkFormat VK_FORMAT_R8G8B8A8_USCALED = new VkFormat("VK_FORMAT_R8G8B8A8_USCALED", 39, 39);
	public static final VkFormat VK_FORMAT_R8G8B8A8_SSCALED = new VkFormat("VK_FORMAT_R8G8B8A8_SSCALED", 40, 40);
	public static final VkFormat VK_FORMAT_R8G8B8A8_UINT = new VkFormat("VK_FORMAT_R8G8B8A8_UINT", 41, 41);
	public static final VkFormat VK_FORMAT_R8G8B8A8_SINT = new VkFormat("VK_FORMAT_R8G8B8A8_SINT", 42, 42);
	public static final VkFormat VK_FORMAT_R8G8B8A8_SRGB = new VkFormat("VK_FORMAT_R8G8B8A8_SRGB", 43, 43);
	public static final VkFormat VK_FORMAT_B8G8R8A8_UNORM = new VkFormat("VK_FORMAT_B8G8R8A8_UNORM", 44, 44);
	public static final VkFormat VK_FORMAT_B8G8R8A8_SNORM = new VkFormat("VK_FORMAT_B8G8R8A8_SNORM", 45, 45);
	public static final VkFormat VK_FORMAT_B8G8R8A8_USCALED = new VkFormat("VK_FORMAT_B8G8R8A8_USCALED", 46, 46);
	public static final VkFormat VK_FORMAT_B8G8R8A8_SSCALED = new VkFormat("VK_FORMAT_B8G8R8A8_SSCALED", 47, 47);
	public static final VkFormat VK_FORMAT_B8G8R8A8_UINT = new VkFormat("VK_FORMAT_B8G8R8A8_UINT", 48, 48);
	public static final VkFormat VK_FORMAT_B8G8R8A8_SINT = new VkFormat("VK_FORMAT_B8G8R8A8_SINT", 49, 49);
	public static final VkFormat VK_FORMAT_B8G8R8A8_SRGB = new VkFormat("VK_FORMAT_B8G8R8A8_SRGB", 50, 50);
	public static final VkFormat VK_FORMAT_A8B8G8R8_UNORM_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_UNORM_PACK32", 51, 51);
	public static final VkFormat VK_FORMAT_A8B8G8R8_SNORM_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_SNORM_PACK32", 52, 52);
	public static final VkFormat VK_FORMAT_A8B8G8R8_USCALED_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_USCALED_PACK32", 53, 53);
	public static final VkFormat VK_FORMAT_A8B8G8R8_SSCALED_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_SSCALED_PACK32", 54, 54);
	public static final VkFormat VK_FORMAT_A8B8G8R8_UINT_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_UINT_PACK32", 55, 55);
	public static final VkFormat VK_FORMAT_A8B8G8R8_SINT_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_SINT_PACK32", 56, 56);
	public static final VkFormat VK_FORMAT_A8B8G8R8_SRGB_PACK32 = new VkFormat("VK_FORMAT_A8B8G8R8_SRGB_PACK32", 57, 57);
	public static final VkFormat VK_FORMAT_A2R10G10B10_UNORM_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_UNORM_PACK32", 58, 58);
	public static final VkFormat VK_FORMAT_A2R10G10B10_SNORM_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_SNORM_PACK32", 59, 59);
	public static final VkFormat VK_FORMAT_A2R10G10B10_USCALED_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_USCALED_PACK32", 60, 60);
	public static final VkFormat VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_SSCALED_PACK32", 61, 61);
	public static final VkFormat VK_FORMAT_A2R10G10B10_UINT_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_UINT_PACK32", 62, 62);
	public static final VkFormat VK_FORMAT_A2R10G10B10_SINT_PACK32 = new VkFormat("VK_FORMAT_A2R10G10B10_SINT_PACK32", 63, 63);
	public static final VkFormat VK_FORMAT_A2B10G10R10_UNORM_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_UNORM_PACK32", 64, 64);
	public static final VkFormat VK_FORMAT_A2B10G10R10_SNORM_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_SNORM_PACK32", 65, 65);
	public static final VkFormat VK_FORMAT_A2B10G10R10_USCALED_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_USCALED_PACK32", 66, 66);
	public static final VkFormat VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_SSCALED_PACK32", 67, 67);
	public static final VkFormat VK_FORMAT_A2B10G10R10_UINT_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_UINT_PACK32", 68, 68);
	public static final VkFormat VK_FORMAT_A2B10G10R10_SINT_PACK32 = new VkFormat("VK_FORMAT_A2B10G10R10_SINT_PACK32", 69, 69);
	public static final VkFormat VK_FORMAT_R16_UNORM = new VkFormat("VK_FORMAT_R16_UNORM", 70, 70);
	public static final VkFormat VK_FORMAT_R16_SNORM = new VkFormat("VK_FORMAT_R16_SNORM", 71, 71);
	public static final VkFormat VK_FORMAT_R16_USCALED = new VkFormat("VK_FORMAT_R16_USCALED", 72, 72);
	public static final VkFormat VK_FORMAT_R16_SSCALED = new VkFormat("VK_FORMAT_R16_SSCALED", 73, 73);
	public static final VkFormat VK_FORMAT_R16_UINT = new VkFormat("VK_FORMAT_R16_UINT", 74, 74);
	public static final VkFormat VK_FORMAT_R16_SINT = new VkFormat("VK_FORMAT_R16_SINT", 75, 75);
	public static final VkFormat VK_FORMAT_R16_SFLOAT = new VkFormat("VK_FORMAT_R16_SFLOAT", 76, 76);
	public static final VkFormat VK_FORMAT_R16G16_UNORM = new VkFormat("VK_FORMAT_R16G16_UNORM", 77, 77);
	public static final VkFormat VK_FORMAT_R16G16_SNORM = new VkFormat("VK_FORMAT_R16G16_SNORM", 78, 78);
	public static final VkFormat VK_FORMAT_R16G16_USCALED = new VkFormat("VK_FORMAT_R16G16_USCALED", 79, 79);
	public static final VkFormat VK_FORMAT_R16G16_SSCALED = new VkFormat("VK_FORMAT_R16G16_SSCALED", 80, 80);
	public static final VkFormat VK_FORMAT_R16G16_UINT = new VkFormat("VK_FORMAT_R16G16_UINT", 81, 81);
	public static final VkFormat VK_FORMAT_R16G16_SINT = new VkFormat("VK_FORMAT_R16G16_SINT", 82, 82);
	public static final VkFormat VK_FORMAT_R16G16_SFLOAT = new VkFormat("VK_FORMAT_R16G16_SFLOAT", 83, 83);
	public static final VkFormat VK_FORMAT_R16G16B16_UNORM = new VkFormat("VK_FORMAT_R16G16B16_UNORM", 84, 84);
	public static final VkFormat VK_FORMAT_R16G16B16_SNORM = new VkFormat("VK_FORMAT_R16G16B16_SNORM", 85, 85);
	public static final VkFormat VK_FORMAT_R16G16B16_USCALED = new VkFormat("VK_FORMAT_R16G16B16_USCALED", 86, 86);
	public static final VkFormat VK_FORMAT_R16G16B16_SSCALED = new VkFormat("VK_FORMAT_R16G16B16_SSCALED", 87, 87);
	public static final VkFormat VK_FORMAT_R16G16B16_UINT = new VkFormat("VK_FORMAT_R16G16B16_UINT", 88, 88);
	public static final VkFormat VK_FORMAT_R16G16B16_SINT = new VkFormat("VK_FORMAT_R16G16B16_SINT", 89, 89);
	public static final VkFormat VK_FORMAT_R16G16B16_SFLOAT = new VkFormat("VK_FORMAT_R16G16B16_SFLOAT", 90, 90);
	public static final VkFormat VK_FORMAT_R16G16B16A16_UNORM = new VkFormat("VK_FORMAT_R16G16B16A16_UNORM", 91, 91);
	public static final VkFormat VK_FORMAT_R16G16B16A16_SNORM = new VkFormat("VK_FORMAT_R16G16B16A16_SNORM", 92, 92);
	public static final VkFormat VK_FORMAT_R16G16B16A16_USCALED = new VkFormat("VK_FORMAT_R16G16B16A16_USCALED", 93, 93);
	public static final VkFormat VK_FORMAT_R16G16B16A16_SSCALED = new VkFormat("VK_FORMAT_R16G16B16A16_SSCALED", 94, 94);
	public static final VkFormat VK_FORMAT_R16G16B16A16_UINT = new VkFormat("VK_FORMAT_R16G16B16A16_UINT", 95, 95);
	public static final VkFormat VK_FORMAT_R16G16B16A16_SINT = new VkFormat("VK_FORMAT_R16G16B16A16_SINT", 96, 96);
	public static final VkFormat VK_FORMAT_R16G16B16A16_SFLOAT = new VkFormat("VK_FORMAT_R16G16B16A16_SFLOAT", 97, 97);
	public static final VkFormat VK_FORMAT_R32_UINT = new VkFormat("VK_FORMAT_R32_UINT", 98, 98);
	public static final VkFormat VK_FORMAT_R32_SINT = new VkFormat("VK_FORMAT_R32_SINT", 99, 99);
	public static final VkFormat VK_FORMAT_R32_SFLOAT = new VkFormat("VK_FORMAT_R32_SFLOAT", 100, 100);
	public static final VkFormat VK_FORMAT_R32G32_UINT = new VkFormat("VK_FORMAT_R32G32_UINT", 101, 101);
	public static final VkFormat VK_FORMAT_R32G32_SINT = new VkFormat("VK_FORMAT_R32G32_SINT", 102, 102);
	public static final VkFormat VK_FORMAT_R32G32_SFLOAT = new VkFormat("VK_FORMAT_R32G32_SFLOAT", 103, 103);
	public static final VkFormat VK_FORMAT_R32G32B32_UINT = new VkFormat("VK_FORMAT_R32G32B32_UINT", 104, 104);
	public static final VkFormat VK_FORMAT_R32G32B32_SINT = new VkFormat("VK_FORMAT_R32G32B32_SINT", 105, 105);
	public static final VkFormat VK_FORMAT_R32G32B32_SFLOAT = new VkFormat("VK_FORMAT_R32G32B32_SFLOAT", 106, 106);
	public static final VkFormat VK_FORMAT_R32G32B32A32_UINT = new VkFormat("VK_FORMAT_R32G32B32A32_UINT", 107, 107);
	public static final VkFormat VK_FORMAT_R32G32B32A32_SINT = new VkFormat("VK_FORMAT_R32G32B32A32_SINT", 108, 108);
	public static final VkFormat VK_FORMAT_R32G32B32A32_SFLOAT = new VkFormat("VK_FORMAT_R32G32B32A32_SFLOAT", 109, 109);
	public static final VkFormat VK_FORMAT_R64_UINT = new VkFormat("VK_FORMAT_R64_UINT", 110, 110);
	public static final VkFormat VK_FORMAT_R64_SINT = new VkFormat("VK_FORMAT_R64_SINT", 111, 111);
	public static final VkFormat VK_FORMAT_R64_SFLOAT = new VkFormat("VK_FORMAT_R64_SFLOAT", 112, 112);
	public static final VkFormat VK_FORMAT_R64G64_UINT = new VkFormat("VK_FORMAT_R64G64_UINT", 113, 113);
	public static final VkFormat VK_FORMAT_R64G64_SINT = new VkFormat("VK_FORMAT_R64G64_SINT", 114, 114);
	public static final VkFormat VK_FORMAT_R64G64_SFLOAT = new VkFormat("VK_FORMAT_R64G64_SFLOAT", 115, 115);
	public static final VkFormat VK_FORMAT_R64G64B64_UINT = new VkFormat("VK_FORMAT_R64G64B64_UINT", 116, 116);
	public static final VkFormat VK_FORMAT_R64G64B64_SINT = new VkFormat("VK_FORMAT_R64G64B64_SINT", 117, 117);
	public static final VkFormat VK_FORMAT_R64G64B64_SFLOAT = new VkFormat("VK_FORMAT_R64G64B64_SFLOAT", 118, 118);
	public static final VkFormat VK_FORMAT_R64G64B64A64_UINT = new VkFormat("VK_FORMAT_R64G64B64A64_UINT", 119, 119);
	public static final VkFormat VK_FORMAT_R64G64B64A64_SINT = new VkFormat("VK_FORMAT_R64G64B64A64_SINT", 120, 120);
	public static final VkFormat VK_FORMAT_R64G64B64A64_SFLOAT = new VkFormat("VK_FORMAT_R64G64B64A64_SFLOAT", 121, 121);
	public static final VkFormat VK_FORMAT_B10G11R11_UFLOAT_PACK32 = new VkFormat("VK_FORMAT_B10G11R11_UFLOAT_PACK32", 122, 122);
	public static final VkFormat VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 = new VkFormat("VK_FORMAT_E5B9G9R9_UFLOAT_PACK32", 123, 123);
	public static final VkFormat VK_FORMAT_D16_UNORM = new VkFormat("VK_FORMAT_D16_UNORM", 124, 124);
	public static final VkFormat VK_FORMAT_X8_D24_UNORM_PACK32 = new VkFormat("VK_FORMAT_X8_D24_UNORM_PACK32", 125, 125);
	public static final VkFormat VK_FORMAT_D32_SFLOAT = new VkFormat("VK_FORMAT_D32_SFLOAT", 126, 126);
	public static final VkFormat VK_FORMAT_S8_UINT = new VkFormat("VK_FORMAT_S8_UINT", 127, 127);
	public static final VkFormat VK_FORMAT_D16_UNORM_S8_UINT = new VkFormat("VK_FORMAT_D16_UNORM_S8_UINT", 128, 128);
	public static final VkFormat VK_FORMAT_D24_UNORM_S8_UINT = new VkFormat("VK_FORMAT_D24_UNORM_S8_UINT", 129, 129);
	public static final VkFormat VK_FORMAT_D32_SFLOAT_S8_UINT = new VkFormat("VK_FORMAT_D32_SFLOAT_S8_UINT", 130, 130);
	public static final VkFormat VK_FORMAT_BC1_RGB_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC1_RGB_UNORM_BLOCK", 131, 131);
	public static final VkFormat VK_FORMAT_BC1_RGB_SRGB_BLOCK = new VkFormat("VK_FORMAT_BC1_RGB_SRGB_BLOCK", 132, 132);
	public static final VkFormat VK_FORMAT_BC1_RGBA_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC1_RGBA_UNORM_BLOCK", 133, 133);
	public static final VkFormat VK_FORMAT_BC1_RGBA_SRGB_BLOCK = new VkFormat("VK_FORMAT_BC1_RGBA_SRGB_BLOCK", 134, 134);
	public static final VkFormat VK_FORMAT_BC2_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC2_UNORM_BLOCK", 135, 135);
	public static final VkFormat VK_FORMAT_BC2_SRGB_BLOCK = new VkFormat("VK_FORMAT_BC2_SRGB_BLOCK", 136, 136);
	public static final VkFormat VK_FORMAT_BC3_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC3_UNORM_BLOCK", 137, 137);
	public static final VkFormat VK_FORMAT_BC3_SRGB_BLOCK = new VkFormat("VK_FORMAT_BC3_SRGB_BLOCK", 138, 138);
	public static final VkFormat VK_FORMAT_BC4_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC4_UNORM_BLOCK", 139, 139);
	public static final VkFormat VK_FORMAT_BC4_SNORM_BLOCK = new VkFormat("VK_FORMAT_BC4_SNORM_BLOCK", 140, 140);
	public static final VkFormat VK_FORMAT_BC5_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC5_UNORM_BLOCK", 141, 141);
	public static final VkFormat VK_FORMAT_BC5_SNORM_BLOCK = new VkFormat("VK_FORMAT_BC5_SNORM_BLOCK", 142, 142);
	public static final VkFormat VK_FORMAT_BC6H_UFLOAT_BLOCK = new VkFormat("VK_FORMAT_BC6H_UFLOAT_BLOCK", 143, 143);
	public static final VkFormat VK_FORMAT_BC6H_SFLOAT_BLOCK = new VkFormat("VK_FORMAT_BC6H_SFLOAT_BLOCK", 144, 144);
	public static final VkFormat VK_FORMAT_BC7_UNORM_BLOCK = new VkFormat("VK_FORMAT_BC7_UNORM_BLOCK", 145, 145);
	public static final VkFormat VK_FORMAT_BC7_SRGB_BLOCK = new VkFormat("VK_FORMAT_BC7_SRGB_BLOCK", 146, 146);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK", 147, 147);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK", 148, 148);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK", 149, 149);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK", 150, 150);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK", 151, 151);
	public static final VkFormat VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK = new VkFormat("VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK", 152, 152);
	public static final VkFormat VK_FORMAT_EAC_R11_UNORM_BLOCK = new VkFormat("VK_FORMAT_EAC_R11_UNORM_BLOCK", 153, 153);
	public static final VkFormat VK_FORMAT_EAC_R11_SNORM_BLOCK = new VkFormat("VK_FORMAT_EAC_R11_SNORM_BLOCK", 154, 154);
	public static final VkFormat VK_FORMAT_EAC_R11G11_UNORM_BLOCK = new VkFormat("VK_FORMAT_EAC_R11G11_UNORM_BLOCK", 155, 155);
	public static final VkFormat VK_FORMAT_EAC_R11G11_SNORM_BLOCK = new VkFormat("VK_FORMAT_EAC_R11G11_SNORM_BLOCK", 156, 156);
	public static final VkFormat VK_FORMAT_ASTC_4x4_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_4x4_UNORM_BLOCK", 157, 157);
	public static final VkFormat VK_FORMAT_ASTC_4x4_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_4x4_SRGB_BLOCK", 158, 158);
	public static final VkFormat VK_FORMAT_ASTC_5x4_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_5x4_UNORM_BLOCK", 159, 159);
	public static final VkFormat VK_FORMAT_ASTC_5x4_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_5x4_SRGB_BLOCK", 160, 160);
	public static final VkFormat VK_FORMAT_ASTC_5x5_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_5x5_UNORM_BLOCK", 161, 161);
	public static final VkFormat VK_FORMAT_ASTC_5x5_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_5x5_SRGB_BLOCK", 162, 162);
	public static final VkFormat VK_FORMAT_ASTC_6x5_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_6x5_UNORM_BLOCK", 163, 163);
	public static final VkFormat VK_FORMAT_ASTC_6x5_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_6x5_SRGB_BLOCK", 164, 164);
	public static final VkFormat VK_FORMAT_ASTC_6x6_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_6x6_UNORM_BLOCK", 165, 165);
	public static final VkFormat VK_FORMAT_ASTC_6x6_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_6x6_SRGB_BLOCK", 166, 166);
	public static final VkFormat VK_FORMAT_ASTC_8x5_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x5_UNORM_BLOCK", 167, 167);
	public static final VkFormat VK_FORMAT_ASTC_8x5_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x5_SRGB_BLOCK", 168, 168);
	public static final VkFormat VK_FORMAT_ASTC_8x6_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x6_UNORM_BLOCK", 169, 169);
	public static final VkFormat VK_FORMAT_ASTC_8x6_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x6_SRGB_BLOCK", 170, 170);
	public static final VkFormat VK_FORMAT_ASTC_8x8_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x8_UNORM_BLOCK", 171, 171);
	public static final VkFormat VK_FORMAT_ASTC_8x8_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_8x8_SRGB_BLOCK", 172, 172);
	public static final VkFormat VK_FORMAT_ASTC_10x5_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x5_UNORM_BLOCK", 173, 173);
	public static final VkFormat VK_FORMAT_ASTC_10x5_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x5_SRGB_BLOCK", 174, 174);
	public static final VkFormat VK_FORMAT_ASTC_10x6_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x6_UNORM_BLOCK", 175, 175);
	public static final VkFormat VK_FORMAT_ASTC_10x6_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x6_SRGB_BLOCK", 176, 176);
	public static final VkFormat VK_FORMAT_ASTC_10x8_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x8_UNORM_BLOCK", 177, 177);
	public static final VkFormat VK_FORMAT_ASTC_10x8_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x8_SRGB_BLOCK", 178, 178);
	public static final VkFormat VK_FORMAT_ASTC_10x10_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x10_UNORM_BLOCK", 179, 179);
	public static final VkFormat VK_FORMAT_ASTC_10x10_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_10x10_SRGB_BLOCK", 180, 180);
	public static final VkFormat VK_FORMAT_ASTC_12x10_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_12x10_UNORM_BLOCK", 181, 181);
	public static final VkFormat VK_FORMAT_ASTC_12x10_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_12x10_SRGB_BLOCK", 182, 182);
	public static final VkFormat VK_FORMAT_ASTC_12x12_UNORM_BLOCK = new VkFormat("VK_FORMAT_ASTC_12x12_UNORM_BLOCK", 183, 183);
	public static final VkFormat VK_FORMAT_ASTC_12x12_SRGB_BLOCK = new VkFormat("VK_FORMAT_ASTC_12x12_SRGB_BLOCK", 184, 184);
	public static final VkFormat VK_FORMAT_BEGIN_RANGE = new VkFormat("VK_FORMAT_BEGIN_RANGE", 185, VK_FORMAT_UNDEFINED.getValue() );
	public static final VkFormat VK_FORMAT_END_RANGE = new VkFormat("VK_FORMAT_END_RANGE", 186, VK_FORMAT_ASTC_12x12_SRGB_BLOCK.getValue() );
	public static final VkFormat VK_FORMAT_RANGE_SIZE = new VkFormat("VK_FORMAT_RANGE_SIZE", 187, (VK_FORMAT_END_RANGE.getValue() - VK_FORMAT_BEGIN_RANGE.getValue() + 1));
	public static final VkFormat VK_FORMAT_MAX_ENUM = new VkFormat("VK_FORMAT_MAX_ENUM", 188,  0x7FFFFFFF);


	/** private ctor */
	private VkFormat(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFormat