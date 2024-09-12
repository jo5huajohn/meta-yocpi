SUMMARY = "A router image"

IMAGE_INSTALL += "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "ipv4 ipv6 usbgadget usbhost wifi"

IMAGE_FEATURES += "empty-root-password read-only-rootfs ssh-server-dropbear"

LICENSE = "MIT"

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_FSTYPES += "wic wic.bmap"
IMAGE_ROOTFS_SIZE ?= "12288"
