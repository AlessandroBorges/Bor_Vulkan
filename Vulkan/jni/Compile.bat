
@echo Compile
rem x86_64-w64-mingw32-g++  -Wall -O2 -mfpmath=sse -msse2 -fmessage-length=0 -m64 -std=gnu++11 -Ijni-headers -Ijni-headers/win32 -I.  C:\Users\Livia\workspace\Vulkan\jni\memcpy_wrap.c -o C:\Users\Livia\workspace\Vulkan\jni\target\windows64\memcpy_wrap.o

x86_64-w64-mingw32-g++  -Wall -O2 -mfpmath=sse -msse2 -fmessage-length=0 -m64 -std=gnu++11 -Ijni-headers -Ijni-headers/win32 -I.  C:\Users\Livia\workspace\Vulkan\jni\*.cpp -o C:\Users\Livia\workspace\Vulkan\jni\target\windows64\borVulkan.o

ECHO LINKING
x86_64-w64-mingw32-g++  -Wl,--kill-at -shared -static -static-libgcc -static-libstdc++ -m64 -o C:\Users\Livia\workspace\Vulkan\libs\windows64\BorVulkan64.dll C:\Users\Livia\workspace\Vulkan\jni\target\windows64\borVulkan.o
rem  C:\Users\Livia\workspace\Vulkan\jni\target\windows64\memcpy_wrap.o
 

