class LocalInnerClassExample:
    # Outer class method
    def admit_patient(self, name):
        print(f"Admitting patient: {name}")

        # ✅ Local Inner Class defined inside the method
        class AdmissionSlip:
            def print_slip(self):
                print("---- Admission Slip ----")
                print(f"Patient Name: {name}")  # Accessing method parameter
                print("Ward: General")
                print("------------------------")

        # ✅ Create object of the local inner class
        slip = AdmissionSlip()

        # ✅ Call method of the local inner class
        slip.print_slip()

# Main execution
if __name__ == "__main__":
    hospital = LocalInnerClassExample()
    hospital.admit_patient("Alice Johnson")
